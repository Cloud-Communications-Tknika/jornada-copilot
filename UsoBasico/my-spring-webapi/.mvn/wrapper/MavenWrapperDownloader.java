import java.net.*;
import java.io.*;
import java.nio.channels.*;

public class MavenWrapperDownloader {

    private static final String WRAPPER_VERSION = "0.5.6";
    private static final String MAVEN_WRAPPER_JAR = ".mvn/wrapper/maven-wrapper.jar";
    private static final String MAVEN_WRAPPER_PROPERTIES = ".mvn/wrapper/maven-wrapper.properties";
    private static final String DOWNLOAD_URL = "https://repo.maven.apache.org/maven2/io/takari/maven-wrapper/"
            + WRAPPER_VERSION + "/maven-wrapper-" + WRAPPER_VERSION + ".jar";

    public static void main(String args[]) {
        System.out.println("- Downloader started");
        File baseDirectory = new File(args[0]).getAbsoluteFile();
        File outFile = new File(baseDirectory, MAVEN_WRAPPER_JAR);
        if (!outFile.exists()) {
            System.out.println("- Downloading to " + outFile.getAbsolutePath());
            downloadFileFromURL(DOWNLOAD_URL, outFile);
            System.out.println("- Successfully downloaded");
        } else {
            System.out.println("- Using existing maven-wrapper.jar");
        }
    }

    private static void downloadFileFromURL(String urlString, File destination) {
        System.out.println("- Downloading from: " + urlString);
        try (ReadableByteChannel rbc = Channels.newChannel(new URL(urlString).openStream());
             FileOutputStream fos = new FileOutputStream(destination)) {
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}