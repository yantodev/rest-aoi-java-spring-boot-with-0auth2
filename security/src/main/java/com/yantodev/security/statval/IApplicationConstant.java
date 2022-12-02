package com.yantodev.security.statval;

public interface IApplicationConstant {

    interface ContextPath {
        String PROFILE = "v1/register";
        String USER = "v1/user";
    }

    interface Path {
        String USER = "";
        String VALIDATE = "/validate";
        String GET_BY_CODE = "/by-username";
    }

    interface Kafka{
        interface Group {
            String GROUP_NAME = "com-telkomsigma-kf";
        }
        interface Topic {
            String TOPIC_USER = "/user-profiler";
        }
    }


}
