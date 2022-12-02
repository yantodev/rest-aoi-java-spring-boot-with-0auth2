package com.yantodev.api.util.statval;

public interface IApplicationConstant {
    String API = "/api";

    interface ContextPath {

        interface Pkl {
            String TEACHER = ContextPath.PKL_V1 + "/teacher";
        }

        String PKL_V1 = "/v1/pkl";
        String DISCOUNT_V1 = API + "/v1/discount";
    }

    interface path {
        interface teacher {
            String FIND_ALL = "/find-all";
        }

        interface discount {
            String COUNT = "/count";
        }
    }
}
