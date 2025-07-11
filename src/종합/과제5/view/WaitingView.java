package 종합.과제5.view;

import 종합.과제5.controller.WaitingController;
import 종합.과제5.model.dto.WaitingDto;

import java.util.Scanner;

public class WaitingView {
    private WaitingView(){}
    private static final WaitingView instance = new WaitingView();
    public static WaitingView getInstance(){
        return instance;
    }
    private WaitingController waitingController = WaitingController.getInstance();

    private Scanner scan = new Scanner(System.in);

    public void index(){
        for( ; ; ){
            System.out.println("=========== 맛집 대기 시스템 ===========");
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.print("선택> ");
            int choose = scan.nextInt();
            if( choose == 1 ){ addWaiting(); }
            else if( choose == 2 ){ getWaitingList(); }
        }
    }

    public void addWaiting( ){
        System.out.print("전화번호 : ");    String phone = scan.next();
        System.out.print("인원수 : ");     int count = scan.nextInt();
        boolean result = waitingController.addWaiting( phone , count );
        if( result ){   System.out.println("[안내] 대기 등록이 완료되었습니다."); }
        else{   System.out.println("[경고] 대기 등록이 실패되었습니다.");  }
    }

    public void getWaitingList(){
        System.out.println("============= 대기 현황 =============");
        WaitingDto[] result = waitingController.getWaitingList();
        for( int i = 0 ; i < result.length ; i++ ) {
            WaitingDto waitingDto = result[i];
            if( waitingDto != null ) {
                System.out.printf("%d 연락처 : %s - %d명 \n", i + 1, waitingDto.getPhone(), waitingDto.getCount());
                System.out.println("------------------------------------");
            }
        }
    }


}








