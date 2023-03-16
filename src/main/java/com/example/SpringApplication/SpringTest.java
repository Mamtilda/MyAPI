package com.example.SpringApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class SpringTest {

    @Autowired
    private Environment environment;


    public static void main(String[] args) {
        SpringApplication.run(SpringTest.class, args);
    }

    @PostConstruct
    public void init() {
        System.out.println("Server port: " + environment.getProperty("server.port"));
    }

    @GetMapping("/hello")
    public String hello() {

        return "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <title>Hello World!</title>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n" +
                "  <link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\" type=\"text/css\">\n" +
                "  <link href=\"https://fonts.googleapis.com/css?family=Lato\" rel=\"stylesheet\" type=\"text/css\">\n" +
                "  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n" +
                "  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n" +
                "  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n" +
                "  <style>\n" +
                "  body {\n" +
                "      font: 400 15px Lato, sans-serif;\n" +
                "      line-height: 1.8;\n" +
                "      color: #000000;\n" +
                "  \n" +
                "  }\n" +
                "  h2 {\n" +
                "      font-size: 24px;\n" +
                "      text-transform: uppercase;\n" +
                "      color: #303030;\n" +
                "      font-weight: 600;\n" +
                "      margin-bottom: 30px;\n" +
                "  }\n" +
                "  h4 {\n" +
                "      font-size: 19px;\n" +
                "      line-height: 1.375em;\n" +
                "      color: #303030;\n" +
                "      font-weight: 400;\n" +
                "      margin-bottom: 30px;\n" +
                "  }  \n" +
                "  .jumbotron {\n" +
                "      background-color: #ff3300  ;\n" +
                "      color: #fff;\n" +
                "      padding: 100px 25px;\n" +
                "      font-family: Montserrat, sans-serif;\n" +
                "  }\n" +
                "  .container-fluid {\n" +
                "      padding: 60px 50px;\n" +
                "  }\n" +
                "  .bg-grey {\n" +
                "      background-color: #f6f6f6;\n" +
                "  }\n" +
                "  .logo-small {\n" +
                "      color: #f4511e;\n" +
                "      font-size: 50px;\n" +
                "  }\n" +
                "  .logo {\n" +
                "      color: #f4511e;\n" +
                "      font-size: 200px;\n" +
                "  }\n" +
                "  .thumbnail {\n" +
                "      padding: 0 0 15px 0;\n" +
                "      border: none;\n" +
                "      border-radius: 0;\n" +
                "  }\n" +
                "  .thumbnail img {\n" +
                "      width: 100%;\n" +
                "      height: 100%;\n" +
                "      margin-bottom: 10px;\n" +
                "  }\n" +
                "  .carousel-control.right, .carousel-control.left {\n" +
                "      background-image: none;\n" +
                "      color: #f4511e;\n" +
                "  }\n" +
                "  .carousel-indicators li {\n" +
                "      border-color: #f4511e;\n" +
                "  }\n" +
                "  .carousel-indicators li.active {\n" +
                "      background-color: #f4511e;\n" +
                "  }\n" +
                "  .item h4 {\n" +
                "      font-size: 19px;\n" +
                "      line-height: 1.375em;\n" +
                "      font-weight: 400;\n" +
                "      font-style: italic;\n" +
                "      margin: 70px 0;\n" +
                "  }\n" +
                "  .item span {\n" +
                "      font-style: normal;\n" +
                "  }\n" +
                "  .panel {\n" +
                "      border: 1px solid #f4511e; \n" +
                "      border-radius:0 !important;\n" +
                "      transition: box-shadow 0.5s;\n" +
                "  }\n" +
                "  .panel:hover {\n" +
                "      box-shadow: 5px 0px 40px rgba(0,0,0, .2);\n" +
                "  }\n" +
                "  .panel-footer .btn:hover {\n" +
                "      border: 1px solid #f4511e;\n" +
                "      background-color: #fff !important;\n" +
                "      color: #f4511e;\n" +
                "  }\n" +
                "  .panel-heading {\n" +
                "      color: #fff !important;\n" +
                "      background-color: #f4511e !important;\n" +
                "      padding: 25px;\n" +
                "      border-bottom: 1px solid transparent;\n" +
                "      border-top-left-radius: 0px;\n" +
                "      border-top-right-radius: 0px;\n" +
                "      border-bottom-left-radius: 0px;\n" +
                "      border-bottom-right-radius: 0px;\n" +
                "  }\n" +
                "  .panel-footer {\n" +
                "      background-color: white !important;\n" +
                "  }\n" +
                "  .panel-footer h3 {\n" +
                "      font-size: 32px;\n" +
                "  }\n" +
                "  .panel-footer h4 {\n" +
                "      color: #aaa;\n" +
                "      font-size: 14px;\n" +
                "  }\n" +
                "  .panel-footer .btn {\n" +
                "      margin: 15px 0;\n" +
                "      background-color: #f4511e;\n" +
                "      color: #fff;\n" +
                "  }\n" +
                "  .navbar {\n" +
                "      margin-bottom: 0;\n" +
                "      background-color: #cc0000;\n" +
                "      z-index: 9999;\n" +
                "      border: 0;\n" +
                "      font-size: 12px !important;\n" +
                "      line-height: 1.42857143 !important;\n" +
                "      letter-spacing: 4px;\n" +
                "      border-radius: 0;\n" +
                "      font-family: Montserrat, sans-serif;\n" +
                "  }\n" +
                "  .navbar li a, .navbar .navbar-brand {\n" +
                "      color: #fff !important;\n" +
                "  }\n" +
                "  .navbar-nav li a:hover, .navbar-nav li.active a {\n" +
                "      color: #f4511e !important;\n" +
                "      background-color: #fff !important;\n" +
                "  }\n" +
                "  .navbar-default .navbar-toggle {\n" +
                "      border-color: transparent;\n" +
                "      color: #fff !important;\n" +
                "  }\n" +
                "  footer .glyphicon {\n" +
                "      font-size: 20px;\n" +
                "      margin-bottom: 20px;\n" +
                "      color: #f4511e;\n" +
                "  }\n" +
                "  .slideanim {visibility:hidden;}\n" +
                "  .slide {\n" +
                "      animation-name: slide;\n" +
                "      -webkit-animation-name: slide;\n" +
                "      animation-duration: 1s;\n" +
                "      -webkit-animation-duration: 1s;\n" +
                "      visibility: visible;\n" +
                "  }\n" +
                "  .rounded-border{\n" +
                "  border-radius: 10px;\n" +
                "  \n" +
                "  }\n" +
                "  @keyframes slide {\n" +
                "    0% {\n" +
                "      opacity: 0;\n" +
                "      transform: translateY(70%);\n" +
                "    } \n" +
                "    100% {\n" +
                "      opacity: 1;\n" +
                "      transform: translateY(0%);\n" +
                "    }\n" +
                "  }\n" +
                "  @-webkit-keyframes slide {\n" +
                "    0% {\n" +
                "      opacity: 0;\n" +
                "      -webkit-transform: translateY(70%);\n" +
                "    } \n" +
                "    100% {\n" +
                "      opacity: 1;\n" +
                "      -webkit-transform: translateY(0%);\n" +
                "    }\n" +
                "  }\n" +
                "  @media screen and (max-width: 768px) {\n" +
                "    .col-sm-4 {\n" +
                "      text-align: center;\n" +
                "      margin: 25px 0;\n" +
                "    }\n" +
                "    .btn-lg {\n" +
                "        width: 100%;\n" +
                "        margin-bottom: 35px;\n" +
                "    }\n" +
                "  }\n" +
                "  @media screen and (max-width: 480px) {\n" +
                "    .logo {\n" +
                "        font-size: 150px;\n" +
                "    }\n" +
                "  </style>\n" +
                "</head>\n" +
                "<body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"60\">\n" +
                "\n" +
                "<nav class=\"navbar navbar-default navbar-fixed-top\">\n" +
                "  <div class=\"container\">\n" +
                "    <div class=\"navbar-header\">\n" +
                "      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n" +
                "        <span class=\"icon-bar\"></span>\n" +
                "        <span class=\"icon-bar\"></span>\n" +
                "        <span class=\"icon-bar\"></span>                        \n" +
                "      </button>\n" +
                "\t  <a class=\"navbar-brand\" href=\"#helloworld\">Hello World</a>\n" +
                "    </div>\n" +
                "    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n" +
                "      <ul class=\"nav navbar-nav navbar-right\">\n" +
                "        \n" +
                "        <li><a href=\"#hello\">Hello</a></li>\n" +
                "        <li><a href=\"#world\">World</a></li>\n" +
                "\t\t<li><a href=\"#hello\">Hello</a></li>\n" +
                "\t\t<li><a href=\"#world\">World</a></li>\n" +
                "      </ul>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</nav>\n" +
                "\n" +
                "<div class=\"jumbotron text-center\" id=\"Home\">\n" +
                "  <h1>Hello World!</h1>";

    }
    @GetMapping("/load")
    public String load() {
        return "<html><body><h1>This is a simple test to see if the page loads correctly!</h1></body></html>";
    }
}
