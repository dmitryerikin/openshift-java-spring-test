package io.dmitryerikin.openshiftjavaspringtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("tests")
public class TestController {

    @GetMapping("/get")
    public List<Test> getTests() {
        List<Test> tests = new ArrayList<>();
        tests.add(new Test("test 1", OffsetDateTime.now()));
        tests.add(new Test("test 2", OffsetDateTime.now().plusDays(1)));
        tests.add(new Test("test 3", OffsetDateTime.now().minusDays(2)));
        return tests;
    }
}
