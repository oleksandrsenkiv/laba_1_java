package ua.lviv.iot.algo.part1.lab1;


import org.junit.jupiter.api.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

public class LightningsWriterTest {


    private List<Light> lightnings;
    private LightningsWriter writer;
    private static final String EXPECTED_FILENAME = "src/main/resources/expected.csv";
    private static final String RESULT_FILENAME = "src/main/resources/result.csv";
    private final File expectedFile = new File(EXPECTED_FILENAME);
    private File actualFile;

    @BeforeEach
    public void setUp() throws IOException {
        writer = new LightningsWriter();
        lightnings = new LinkedList<>();
        LightningsWriter lightningsWriter = new LightningsWriter();
        lightnings.add(new DeskLamp("Accento lightning", 20, 300, false, 6, "Yellow"));
        lightnings.add(new DeskLamp("Brilloner", 24, 280, true, 2, "Blue"));
        lightnings.add(new Candle(100, 12, "Sinsay", true, "Round"));
        lightnings.add(new Candle(200, 50, "Yusk", true, "Square"));
        lightnings.add(new Flashlight("Xiaomi", 150, 110, true, 25));
        lightnings.add(new Flashlight("RZTK", 10, 250, false, 100));
        lightnings.add(new GasLamp(300, 15, "Kovea", true, 2));
        lightnings.add(new GasLamp(215, 12, "WALKING", false, 1));
        actualFile = new File(RESULT_FILENAME);
    }

    @AfterAll
    public static void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(RESULT_FILENAME));
    }

    @Test
    public void testWriteListOfLightnings() throws IOException {
        writer.writeToFile(lightnings, RESULT_FILENAME);
        File file = new File(RESULT_FILENAME);
        Path expected = new File(RESULT_FILENAME).toPath();
        Path actual = new File(EXPECTED_FILENAME).toPath();
        Assertions.assertEquals(-1L, Files.mismatch(expected, actual));
    }

    @Test
    public void testEmptyWrite() throws IOException {
        lightnings = new LinkedList<>();
        actualFile = new File(RESULT_FILENAME);
        writer.writeToFile(lightnings, RESULT_FILENAME);
        Assertions.assertFalse(actualFile.exists());

    }


    @Test
    public void testWriteFileInFullFile() throws IOException {
        FileWriter HelloWorld = new FileWriter(RESULT_FILENAME);
        HelloWorld.write("Hello world");
        HelloWorld.close();
        testWriteListOfLightnings();

    }


}