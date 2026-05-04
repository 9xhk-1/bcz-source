package id;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.course_api.ChoiceBaseItem;
import com.baicizhan.online.course_api.ImproveVideoInfo;
import com.baicizhan.online.course_api.QuestionItem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final int f60493g = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ImproveVideoInfo f60494a;

    /* renamed from: b, reason: collision with root package name */
    public final long f60495b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f60496c;

    /* renamed from: d, reason: collision with root package name */
    public final long f60497d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f60498e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f60499f;

    public a(@m80.k ImproveVideoInfo classInfo, long j11) {
        g0.p(classInfo, "classInfo");
        this.f60494a = classInfo;
        this.f60495b = j11;
        String video_url = classInfo.video_url;
        g0.o(video_url, "video_url");
        this.f60496c = video_url;
        this.f60497d = classInfo.duration;
        String str = classInfo.next_url;
        this.f60498e = str == null ? "" : str;
        this.f60499f = classInfo.video_status == 1;
    }

    public final long a() {
        return this.f60495b;
    }

    @m80.k
    public final String b() {
        return this.f60498e;
    }

    public final boolean c() {
        return this.f60499f;
    }

    @m80.l
    public final q d(long j11) {
        Object obj;
        List<QuestionItem> list;
        List<ChoiceBaseItem> list2;
        int size;
        List<QuestionItem> list3 = this.f60494a.questions;
        if (list3 != null) {
            Iterator<T> it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                QuestionItem questionItem = (QuestionItem) obj;
                long j12 = questionItem.show_time - j11;
                if (0 <= j12 && j12 < 201 && (list2 = questionItem.selects) != null && 2 <= (size = list2.size()) && size < 5) {
                    break;
                }
            }
            QuestionItem questionItem2 = (QuestionItem) obj;
            if (questionItem2 != null && (list = this.f60494a.questions) != null) {
                return o.a(questionItem2, this.f60495b, list.indexOf(questionItem2));
            }
        }
        return null;
    }

    public final long e() {
        return this.f60497d;
    }

    @m80.k
    public final String f() {
        return this.f60496c;
    }
}
