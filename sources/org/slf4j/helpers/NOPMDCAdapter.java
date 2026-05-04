package org.slf4j.helpers;

import java.util.Deque;
import java.util.Map;
import org.slf4j.spi.MDCAdapter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class NOPMDCAdapter implements MDCAdapter {
    @Override // org.slf4j.spi.MDCAdapter
    public String get(String str) {
        return null;
    }

    @Override // org.slf4j.spi.MDCAdapter
    public Map<String, String> getCopyOfContextMap() {
        return null;
    }

    @Override // org.slf4j.spi.MDCAdapter
    public Deque<String> getCopyOfDequeByKey(String str) {
        return null;
    }

    @Override // org.slf4j.spi.MDCAdapter
    public String popByKey(String str) {
        return null;
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void clear() {
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void clearDequeByKey(String str) {
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void remove(String str) {
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void setContextMap(Map<String, String> map) {
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void pushByKey(String str, String str2) {
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void put(String str, String str2) {
    }
}
