package com.example.Web3.mbeans.result_mbean;

import com.example.Web3.entity.Result;

import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

public class ResultChecker extends NotificationBroadcasterSupport implements ResultCheckerMBean {

    private long countOfPoints;
    private long countOfMissPoints;

    public ResultChecker() {
    }


    public void addPoint(Result result) {
        countOfPoints++;
        if (!result.isResult()) countOfMissPoints++;
        if (countOfMissPoints % 5 == 0) {
            Notification notification = new Notification("countOfMissedPointsMultipleFive",
                    this, countOfMissPoints, "Count of missed points is multiple of five");
            sendNotification(notification);
        }
    }

    @Override
    public long getCountOfPoints() {
        return countOfPoints;
    }

    @Override
    public long getCountOfMissPoints() {
        return countOfMissPoints;
    }

}

 