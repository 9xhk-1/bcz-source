package da0;

import ba0.g4;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import da0.k;
import java.util.Objects;
import java.util.Optional;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class t1 implements ca0.l {

    /* renamed from: a, reason: collision with root package name */
    public final String f47585a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "1.11", status = API.Status.INTERNAL)
    public static class a implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final String f47586a = "package";

        @Override // da0.k
        public Optional<t1> a(ca0.o identifier, k.a context) {
            return Optional.of(x.T(identifier.e()));
        }

        @Override // da0.k
        public String getPrefix() {
            return "package";
        }
    }

    public t1(String packageName) {
        this.f47585a = packageName;
    }

    @Override // ca0.l
    public Optional<ca0.o> a() {
        return Optional.of(ca0.o.c("package", this.f47585a));
    }

    public String b() {
        return this.f47585a;
    }

    @API(since = "1.3", status = API.Status.STABLE)
    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 == null || getClass() != o11.getClass()) {
            return false;
        }
        return Objects.equals(this.f47585a, ((t1) o11).f47585a);
    }

    @API(since = "1.3", status = API.Status.STABLE)
    public int hashCode() {
        return this.f47585a.hashCode();
    }

    public String toString() {
        return new g4(this).a(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME, this.f47585a).toString();
    }
}
