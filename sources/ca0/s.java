package ca0;

import org.apiguardian.api.API;
import org.junit.platform.engine.TestDescriptor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final TestDescriptor f8473a;

    /* renamed from: b, reason: collision with root package name */
    public final r f8474b;

    /* renamed from: c, reason: collision with root package name */
    public final j f8475c;

    @API(since = "1.0", status = API.Status.INTERNAL)
    public s(TestDescriptor rootTestDescriptor, r engineExecutionListener, j configurationParameters) {
        this.f8473a = rootTestDescriptor;
        this.f8474b = engineExecutionListener;
        this.f8475c = configurationParameters;
    }

    @API(since = "1.9", status = API.Status.STABLE)
    public static s a(TestDescriptor rootTestDescriptor, r engineExecutionListener, j configurationParameters) {
        return new s(rootTestDescriptor, engineExecutionListener, configurationParameters);
    }

    public j b() {
        return this.f8475c;
    }

    public r c() {
        return this.f8474b;
    }

    public TestDescriptor d() {
        return this.f8473a;
    }
}
