package 종합.과제5.controller;

import 종합.과제5.model.dao.WaitingDao;
import 종합.과제5.model.dto.WaitingDto;

public class WaitingController {
    private WaitingController(){}
    private static final WaitingController instance = new WaitingController();
    public static WaitingController getInstance(){
        return instance;
    }
    private WaitingDao waitingDao = WaitingDao.getInstance();

    public boolean addWaiting( String phone , int count ){
        boolean result = false;
        result = waitingDao.addWaiting( phone , count );
        return result;
    }

    public  WaitingDto[ ] getWaitingList( ){
        return waitingDao.getWaitingList();
    }

}
