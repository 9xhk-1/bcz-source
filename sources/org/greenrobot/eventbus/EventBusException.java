package org.greenrobot.eventbus;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class EventBusException extends RuntimeException {
    private static final long serialVersionUID = -2912559384646531479L;

    public EventBusException(String str) {
        super(str);
    }

    public EventBusException(Throwable th2) {
        super(th2);
    }

    public EventBusException(String str, Throwable th2) {
        super(str, th2);
    }
}
