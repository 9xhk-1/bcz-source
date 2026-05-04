package com.getui.gtc.base.http;

/* loaded from: classes6.dex */
public interface Call {

    public interface Callback {
        void onFailure(Call call, Exception exc);

        void onResponse(Call call, Response response);
    }

    void cancel();

    void enqueue(Callback callback);

    Response execute() throws Exception;

    boolean isCanceled();

    boolean isExecuted();

    Request request();
}
