package gg;

import a00.i0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.examassistant.data.MarkedWord;
import com.baicizhan.online.course_api.CourseApiService;
import com.baicizhan.online.course_api.MarkTopicInfo;
import j00.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nExamAssistantServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExamAssistantServiceImpl.kt\ncom/baicizhan/main/examassistant/data/impl/ExamAssistantServiceImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n1563#2:23\n1634#2,3:24\n*S KotlinDebug\n*F\n+ 1 ExamAssistantServiceImpl.kt\ncom/baicizhan/main/examassistant/data/impl/ExamAssistantServiceImpl\n*L\n18#1:23\n18#1:24,3\n*E\n"})
/* loaded from: classes4.dex */
public final class a implements fg.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f53723a = 0;

    @Override // fg.a
    @l
    public Object a(int i11, int i12, @k c<? super g2> cVar) {
        c().delete_mark_word(i11, i12);
        return g2.f100423a;
    }

    @Override // fg.a
    @l
    public Object b(int i11, @k c<? super List<MarkedWord>> cVar) {
        List<MarkTopicInfo> list = c().get_mark_book_list(i11);
        g0.o(list, "get_mark_book_list(...)");
        List<MarkTopicInfo> list2 = list;
        ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
        for (MarkTopicInfo markTopicInfo : list2) {
            int i12 = markTopicInfo.topic_id;
            String word = markTopicInfo.word;
            g0.o(word, "word");
            String cn_means = markTopicInfo.cn_means;
            g0.o(cn_means, "cn_means");
            String audio_url = markTopicInfo.audio_url;
            g0.o(audio_url, "audio_url");
            arrayList.add(new MarkedWord(i12, word, cn_means, audio_url, markTopicInfo.word_add_time, markTopicInfo.accent));
        }
        return arrayList;
    }

    public final CourseApiService.Client c() {
        return (CourseApiService.Client) new com.baicizhan.client.business.thrift.l("/rpc/course").a();
    }
}
