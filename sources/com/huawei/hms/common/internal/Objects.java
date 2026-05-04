package com.huawei.hms.common.internal;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l50.b;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class Objects {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ToStringHelper {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f35574a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f35575b;

        public final ToStringHelper add(String str, Object obj) {
            String str2 = (String) Preconditions.checkNotNull(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(str2.length() + valueOf.length() + 1);
            sb2.append(str2);
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(valueOf);
            this.f35574a.add(sb2.toString());
            return this;
        }

        public final String toString() {
            String simpleName = this.f35575b.getClass().getSimpleName();
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(simpleName);
            sb2.append(b.f69927i);
            int size = this.f35574a.size();
            for (int i11 = 0; i11 < size; i11++) {
                sb2.append(this.f35574a.get(i11));
                if (i11 < size - 1) {
                    sb2.append(j2.O);
                }
            }
            sb2.append(b.f69928j);
            return sb2.toString();
        }

        private ToStringHelper(Object obj) {
            this.f35575b = Preconditions.checkNotNull(obj);
            this.f35574a = new ArrayList();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return obj != null && obj.equals(obj2);
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static boolean isNull(Object... objArr) {
        if (objArr == null) {
            return true;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj);
    }
}
