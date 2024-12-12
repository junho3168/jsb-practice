package com.mysite.sbb.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class QuestionController {

    private final QuestionRepository questionService;

    @GetMapping("/question/list")
    public String list(Model model) {
        List<Question> questionList = this.questionService.findAll();
        model.addAttribute("questionList", questionList);
        return "question_list";
    }
        @GetMapping(value = "/question/detail/{id}")
        public String detail(Model model, @PathVariable("id") Integer id) {
            return "question_detail";

    }
}
