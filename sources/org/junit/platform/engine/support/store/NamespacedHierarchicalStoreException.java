package org.junit.platform.engine.support.store;

import org.apiguardian.api.API;
import org.junit.platform.commons.JUnitException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.10", status = API.Status.EXPERIMENTAL)
/* loaded from: classes9.dex */
public class NamespacedHierarchicalStoreException extends JUnitException {
    private static final long serialVersionUID = 1;

    public NamespacedHierarchicalStoreException(String message) {
        super(message);
    }

    public NamespacedHierarchicalStoreException(String message, Throwable cause) {
        super(message, cause);
    }
}
