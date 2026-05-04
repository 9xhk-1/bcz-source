package org.slf4j.spi;

import java.util.Deque;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface MDCAdapter {
    void clear();

    void clearDequeByKey(String str);

    String get(String str);

    Map<String, String> getCopyOfContextMap();

    Deque<String> getCopyOfDequeByKey(String str);

    String popByKey(String str);

    void pushByKey(String str, String str2);

    void put(String str, String str2);

    void remove(String str);

    void setContextMap(Map<String, String> map);
}
