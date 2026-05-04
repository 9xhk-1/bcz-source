package com.igexin.assist;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes7.dex */
public class MessageBean {

    /* renamed from: a, reason: collision with root package name */
    private String f36997a;

    /* renamed from: b, reason: collision with root package name */
    private String f36998b;

    /* renamed from: c, reason: collision with root package name */
    private Object f36999c;

    /* renamed from: d, reason: collision with root package name */
    private Context f37000d;
    public final Bundle extra = new Bundle();

    public MessageBean(Context context, String str, Object obj) {
        this.f36998b = str;
        this.f36999c = obj;
        this.f37000d = context;
    }

    public Context getContext() {
        return this.f37000d;
    }

    public Object getMessage() {
        return this.f36999c;
    }

    public String getMessageSource() {
        return this.f36997a;
    }

    public String getMessageType() {
        return this.f36998b;
    }

    public Object getObjectMessage() {
        return this.f36999c;
    }

    public String getStringMessage() {
        Object obj = this.f36999c;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public void setMessageSource(String str) {
        this.f36997a = str;
    }
}
