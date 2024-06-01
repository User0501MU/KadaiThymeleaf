package com.techacademy;

/*
//OutputController
//メソッド名: postOutput 処理内容: 入力画面から入力値を受け取って、出力画面を表示する

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


	@Controller
	public class OutputController {

		@PostMapping("/Output")
		//@GetMapping("/") アノテーションは、URL http://localhost:8080/（「/」のアドレス）に対する「GETメソッド」を受け取る関数であることを示します。
		public String getInput(@RequestParam("val")String val,Model model) {
			model.addAttribute("previous",val);//val任意
	        // inputpit.htmlに画面遷移
	        return "Output";
	    }

	}
*/


//OutputController.java
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

 @PostMapping("/output")
 public String postOutput(@RequestParam("inputValue") String inputValue, Model model) {
     // 入力値を受け取ってモデルに追加
     model.addAttribute("inputValue", inputValue);
     return "output";
 }
}