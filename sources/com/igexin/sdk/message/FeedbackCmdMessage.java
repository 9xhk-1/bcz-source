package com.igexin.sdk.message;

/* loaded from: classes7.dex */
public class FeedbackCmdMessage extends GTCmdMessage {
    private String actionId;
    private String result;
    private String taskId;
    private long timeStamp;

    public FeedbackCmdMessage() {
    }

    public String getActionId() {
        return this.actionId;
    }

    public String getResult() {
        return this.result;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public void setActionId(String str) {
        this.actionId = str;
    }

    public void setResult(String str) {
        this.result = str;
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public void setTimeStamp(long j11) {
        this.timeStamp = j11;
    }

    public FeedbackCmdMessage(String str, String str2, String str3, long j11, int i11) {
        super(i11);
        this.taskId = str;
        this.actionId = str2;
        this.result = str3;
        this.timeStamp = j11;
    }
}
