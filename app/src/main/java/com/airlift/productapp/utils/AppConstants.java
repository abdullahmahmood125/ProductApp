package com.airlift.productapp.utils;

import org.jetbrains.annotations.Nullable;

public class AppConstants {

    public static String USER_SELECTED = "";

    public static String EMPLOYEE = "employee";
    public static String DISPATCHER = "dispatcher";
    public static String ADMIN = "admin";

    public static String TAG = "WORKMYPHONE_ ";
    @Nullable
    public static final String IS_LOGGED_IN = "IS_LOGGED_IN";
    public static final int HOME_INDEX = 0;
    public static final String HOME = "HOME";

    public static String check_your_internet = "Check you Internet connection.";
    public static String gps_is_off = "Please allow/open location services on your cell.";
    public static String not_in_fence_zone = "You are currently not with in the defined location";
    public static String we_are_getting = "We are getting your location, please wait";
    public static String no_permission_for_location = "Unable to get location permission";


    public static final int CODE_ERROR = 0;
    public static final int CODE_SUCCESS = 1;

    public static final String MESSAGE_ERROR = "Some thing wrong.";
    public static final String MESSAGE_SUCCESS = "Success";

    public static final String CREATE_JOB_MODULE_INDEX = "1";
    public static final String DISPATCHER_PENDING_JOB_MODULE_INDEX = "2";
    public static final String DISPATCHER_COMPLETED_JOB_MODULE_INDEX = "3";
    public static final String EMPLOYEE_PENDING_JOB_MODULE_INDEX = "4";
    public static final String EMPLOYEE_COMPLETED_JOB_MODULE_INDEX = "5";
    public static final String ADMIN_CREATE_USER_INDEX = "6";
    public static final String ADMIN_DELETE_USER_INDEX = "7";
    public static final String DELETE_JOB_MODULE_INDEX = "8";

    public static final String CREATE_JOB_MODULE_NAME = "Create Work";
    public static final String DISPATCHER_PENDING_JOB_MODULE_NAME = "Pending Work";
    public static final String DISPATCHER_COMPLETED_JOB_MODULE_NAME = "Completed Work";
    public static final String EMPLOYEE_PENDING_JOB_MODULE_NAME = "Pending Work";
    public static final String EMPLOYEE_COMPLETED_JOB_MODULE_NAME = "Completed Work";
    public static final String ADMIN_CREATE_USER_NAME = "Create User";
    public static final String ADMIN_DELETE_USER_NAME = "Delete User";
    public static final String DELETE_JOB_MODULE_NAME = "Delete Work";


    public static String USER_LATITUDE = "USER_LATITUDE";
    public static String USER_LONGITUDE = "USER_LONGITUDE";

    public static String CHANNEL_ID_ATTENDANCE = "ATTENDANCE";
    public static int NOTIFICATION_ID_ATTENEANCE_ALERT = 100;

    public static String CHECKOUT_JOB_ID = "CHECKOUT_JOB_ID";
    public static int NOTIFICATION_ID = 1001;
    public static String FCM_ID = "FCM_ID";
    public static final String PUSH_NOTIFICATION = "pushNotification";

}
