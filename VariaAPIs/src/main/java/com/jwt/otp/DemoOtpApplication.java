package com.jwt.otp;

public class DemoOtpApplication {

}

//
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import com.twilio.Twilio;
//import com.twilio.rest.api.v2010.account.Message;
//import com.twilio.type.PhoneNumber;
//
//@SpringBootApplication
//public class DemoOtpApplication implements ApplicationRunner {
//   private final static String ACCOUNT_SID = "AC897651ddd576a44e1aff105eff5e7453";
//   private final static String AUTH_ID = "9779bf15fef30d89264d1916c801761c";
//
//   static {
//      Twilio.init(ACCOUNT_SID, AUTH_ID);
//   }
//   public static void main(String[] args) {
//      SpringApplication.run(DemoOtpApplication.class, args);
//   }
//   @Override
//   public void run(ApplicationArguments arg0) throws Exception {
//      Message.creator(new PhoneNumber("+919824629886"), new PhoneNumber("+12058274543"),
//         "Congratulation for your First otp Application...Deep!!!").create();
//   }
//}