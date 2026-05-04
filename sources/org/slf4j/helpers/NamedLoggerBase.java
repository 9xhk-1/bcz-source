package org.slf4j.helpers;

import java.io.ObjectStreamException;
import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
abstract class NamedLoggerBase implements Logger, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    protected String name;

    @Override // org.slf4j.Logger
    public String getName() {
        return this.name;
    }

    public Object readResolve() throws ObjectStreamException {
        return LoggerFactory.getLogger(getName());
    }
}
