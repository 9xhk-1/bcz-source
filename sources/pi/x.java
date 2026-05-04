package pi;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.resource_api.WordBugType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class x extends a {

    /* renamed from: i, reason: collision with root package name */
    public static final int f80647i = 0;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final String f80648h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@m80.k String title, @m80.k String text, @m80.k WordBugType bugType, boolean z11, int i11) {
        super(title, z11, bugType, i11);
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(text, "text");
        kotlin.jvm.internal.g0.p(bugType, "bugType");
        this.f80648h = text;
    }

    @m80.k
    public final String e() {
        return this.f80648h;
    }

    public /* synthetic */ x(String str, String str2, WordBugType wordBugType, boolean z11, int i11, int i12, kotlin.jvm.internal.v vVar) {
        this(str, str2, wordBugType, (i12 & 8) != 0 ? true : z11, (i12 & 16) != 0 ? 0 : i11);
    }
}
