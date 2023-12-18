import java.net.*;
import java.io.*;
import java.nio.channels.*;

public class MavenWrapperDownloader {

    private static final String WRAPPER_VERSION = "0.5.6";
    private static final String MAVEN_WRAPPER_JAR = ".mvn/wrapper/maven-wrapper.jar";
    private static final String MAVEN_WRAPPER_DOWNLOAD_URL =
        "https://repo.maven.apache.org/maven2/io/takari/maven-wrapper/"
        + WRAPPER_VERSION + "/maven-wrapper-" + WRAPPER_VERSION + ".jar";

    public static void main(String args[]) {
        System.out.println("- Downloader started");
        File outputFile = new File(MAVEN_WRAPPER_JAR);
        if (!outputFile.getParentFile().exists()) {
            outputFile.getParentFile().mkdirs();
        }
        System.out.println("- Downloading to " + MAVEN_WRAPPER_JAR);
        downloadFile(MAVEN_WRAPPER_DOWNLOAD_URL, MAVEN_WRAPPER_JAR);
        System.out.println("- Download complete");
        System.exit(0);
    }

    private static void downloadFile(String url, String outputFile) {
        try {
            URL website = new URL(url);
            ReadableByteChannel rbc;
            rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream(outputFile);
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            fos.close();
            rbc.close();
        } catch (Exception e) {
            System.out.println("- Error downloading " + e.getMessage());
        }
    }
}