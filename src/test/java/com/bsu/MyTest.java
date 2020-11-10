package com.bsu;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class MyTest {
    @Test
    void checkValidNumbers() {
        List<String> list = Arrays.asList("3,000.6", "0.5",
                "10,.5", "3692 38", "507");
        List<String> res = new ArrayList<>();
        for(String line: list){
            if(Main.checkValidNumbers(line)){
                res.add(line);
            }
        }
        assertEquals(Arrays.asList(list.get(0), list.get(1), list.get(4)), res);
    }
}

