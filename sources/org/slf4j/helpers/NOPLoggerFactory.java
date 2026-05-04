package org.slf4j.helpers;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class NOPLoggerFactory implements ILoggerFactory {
    @Override // org.slf4j.ILoggerFactory
    public Logger getLogger(String str) {
        return NOPLogger.NOP_LOGGER;
    }
}
