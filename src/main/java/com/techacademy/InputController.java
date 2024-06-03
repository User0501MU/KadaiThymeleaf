package com.techacademy;
//InputController

//メソッド名: getInput 処理内容: 入力画面の初期表示をする

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.ui.Model;
//インポート文解決＞springbootで作成しなさい！control＋shift＋O

//POSTメソッドでoutputに送信する処理

@Controller
public class InputController {

	@GetMapping("/input")
	// @GetMapping("/") アノテーションは、URL
	// http://localhost:8080/（「/」のアドレス）に対する「GETメソッド」を受け取る関数であることを示します。
	public String getInput() {

		// inputpit.htmlに画面遷移
		return "input";
	}
}