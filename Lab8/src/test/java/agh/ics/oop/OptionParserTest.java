package agh.ics.oop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class OptionParserTest {

    @Test
    void optionParserTest() throws Exception {
        OptionParser parser = new OptionParser();
        ArrayList<MoveDirection> convertedDirections = new ArrayList<MoveDirection>();
        convertedDirections.add(MoveDirection.FORWARD);
        convertedDirections.add(MoveDirection.BACKWARD);
        convertedDirections.add(MoveDirection.RIGHT);
        convertedDirections.add(MoveDirection.LEFT);
        convertedDirections.add(MoveDirection.FORWARD);
        convertedDirections.add(MoveDirection.BACKWARD);
        convertedDirections.add(MoveDirection.RIGHT);
        convertedDirections.add(MoveDirection.LEFT);
        String[] arg = new String[] {"f", "g", "r", "l", "f", "f", "r", "r", "f", "f", "f", "f", "f", "f", "f", "f"};
        List<String> al = Arrays.asList(arg);
        assertThrows(IllegalArgumentException.class, () -> {
            parser.parse(al);
        });
        //assertEquals(new Exception(), parser.parse(al));

    }


}
