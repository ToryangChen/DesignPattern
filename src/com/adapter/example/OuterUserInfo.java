package com.adapter.example;

import java.util.Map;

/**
 * Created by toryang on 7/18/16.
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {
    private Map baseInfo = super.getUserBaseInfo();
    private Map homeInfo = super.getUserHomeAddress();
    private Map officeInfo = super.getUserOfficeInfo();

    @Override
    public String getUserName() {
        String userName = (String)this.baseInfo.get("username");
        System.out.println(userName);

        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String)this.homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String)this.baseInfo.get("mobilenumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = (String)this.officeInfo.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    @Override
    public String getJobPosition() {
        String jobPosition = (String)this.officeInfo.get("jobPosition");
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNum = (String)this.homeInfo.get("homeTelNumber");
        System.out.println(homeTelNum);
        return homeTelNum;
    }
}
