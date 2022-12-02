package com.yantodev.security.statval;

/**
 * Created on 11/1/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public enum EResponseCode {

    RC_SUCCESS(200, "200", "Success"),
    RC_NOT_CONTENT(204, "204", "Not Content"),
    RC_FAILURE(500, "500", "Web Service Failure"),
    RC_OUTLET_MOBILE_NOT_FOUND(404, "404", "Outlet Mobile Not Found"),
    RC_BAD_REQUEST(400, "400", "Bad Request"),

    RC_MANDATORY_NOT_COMPLETE(200, "403", "Mandatory Field Not Complete");

    private final int httpResponse;
    private final String responseCode;
    private final String responseMsg;

    EResponseCode(int httpResponse, String responseCode, String responseMsg) {
        this.httpResponse = httpResponse;
        this.responseCode = responseCode;
        this.responseMsg = responseMsg;
    }

    public int getHttpResponse() {
        return httpResponse;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    @Override
    public String toString() {
        return responseMsg;
    }
}
