package ol;

import a3.d0;
import com.esotericsoftware.spine.Skeleton;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class k extends b {

    /* renamed from: b, reason: collision with root package name */
    @d0
    public Skeleton f77594b;

    public k(String str) {
        super(str);
    }

    @Override // ol.b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public k h() {
        return new k(this);
    }

    @d0
    public Skeleton k() {
        return this.f77594b;
    }

    public void l(@d0 Skeleton skeleton) {
        this.f77594b = skeleton;
    }

    public k(k kVar) {
        super(kVar);
        this.f77594b = kVar.f77594b;
    }
}
