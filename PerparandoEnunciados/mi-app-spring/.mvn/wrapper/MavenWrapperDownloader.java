import java.net.*;
import java.io.*;
import java.nio.channels.*;

public class MavenWrapperDownloader {

    private static final String WRAPPER_URL = "https://repo.maven.apache.org/maven2/io/takari/maven-wrapper/0.5.6/maven-wrapper.jar";

    public static void main(String args[]) {
        File outputFile = new File("./.mvn/wrapper/maven-wrapper.jar");
        if (!outputFile.getParentFile().exists()) {
            outputFile.getParentFile().mkdirs();
        }
        downloadFileFromURL(WRAPPER_URL, outputFile);
    }

    private static void downloadFileFromURL(String urlString, File destination) {
        try {
            URL website = new URL(urlString);
            ReadableByteChannel rbc;
            rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream(destination);
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            fos.close();
            rbc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}