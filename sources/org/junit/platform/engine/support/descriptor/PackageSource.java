package org.junit.platform.engine.support.descriptor;

import ba0.c2;
import ba0.g4;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Objects;
import org.apiguardian.api.API;
import org.junit.platform.engine.TestSource;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class PackageSource implements TestSource {
    private static final long serialVersionUID = 1;
    private final String packageName;

    private PackageSource(Package javaPackage) {
        this(((Package) c2.r(javaPackage, "package must not be null")).getName());
    }

    public static PackageSource from(Package javaPackage) {
        return new PackageSource(javaPackage);
    }

    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 == null || getClass() != o11.getClass()) {
            return false;
        }
        return Objects.equals(this.packageName, ((PackageSource) o11).packageName);
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return this.packageName.hashCode();
    }

    public String toString() {
        return new g4(this).a(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME, this.packageName).toString();
    }

    private PackageSource(String packageName) {
        this.packageName = c2.k(packageName, "package name must not be null or blank");
    }

    public static PackageSource from(String packageName) {
        return new PackageSource(packageName);
    }
}
