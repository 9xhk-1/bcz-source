package com.heytap.msp.push.constant;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class EventConstant {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface EventId {
        public static final String EVENT_ID_PUSH_APP_NO_SHOW = "push_app_no_show";
        public static final String EVENT_ID_PUSH_CHANNEL_NONE_IMPORTANCE = "push_channel_none_importance";
        public static final String EVENT_ID_PUSH_CLICK = "push_click";
        public static final String EVENT_ID_PUSH_DELETE = "push_delete";
        public static final String EVENT_ID_PUSH_NO_SHOW = "push_no_show";
        public static final String EVENT_ID_PUSH_SHOW = "push_show";
        public static final String EVENT_ID_READ_MESSAGE = "push_read_message";
    }
}
