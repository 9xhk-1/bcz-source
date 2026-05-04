package com.baicizhan.client.business.lookup.rx;

import android.content.Context;
import android.text.TextUtils;
import com.baicizhan.client.business.lookup.Word;
import com.baicizhan.client.business.thrift.o;
import com.baicizhan.client.business.util.ErrCodes;
import com.baicizhan.client.business.util.NoProguard;
import com.baicizhan.client.business.util.WordMeanUtils;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.resource_api.SearchWordResultV2;
import com.baicizhan.online.resource_api.WordBasicInfo;
import com.baicizhan.online.resource_api.WordDictV2;
import com.baicizhan.online.thrift.basic.LogicException;
import i9.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.apache.thrift.TException;
import qb0.g;
import rx.c;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class LookupEngine {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Params implements NoProguard {
        public static final int TOKEN_LOOKUP_EXACT = 1;
        public static final int TOKEN_LOOKUP_NORMAL = 0;
        public String errmsg;
        public String keyword;
        public int limit;
        public List<Word> results;
        public int token;
        public boolean searching = false;
        public int errcode = 0;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements c.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16368a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Word f16369b;

        public a(final Context val$context, final Word val$word) {
            this.f16368a = val$context;
            this.f16369b = val$word;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(g<? super Boolean> subscriber) {
            try {
                p9.a.a(this.f16368a, this.f16369b);
                subscriber.onNext(Boolean.TRUE);
                subscriber.onCompleted();
            } catch (Throwable th2) {
                subscriber.onError(th2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Callable<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16370a;

        public b(final Context val$context) {
            this.f16370a = val$context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            p9.a.b(this.f16370a);
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements c.a<Params> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Params f16371a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f16372b;

        public c(final Params val$input, final Context val$context) {
            this.f16371a = val$input;
            this.f16372b = val$context;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(g<? super Params> subscriber) {
            Params params = new Params();
            Params params2 = this.f16371a;
            params.token = params2.token;
            params.keyword = params2.keyword;
            params.limit = params2.limit;
            try {
                LookupEngine.l(this.f16372b, params, subscriber);
            } catch (Throwable th2) {
                subscriber.onError(th2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements p<Word, rx.c<Word>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f16373a;

        public d(final String val$keyword) {
            this.f16373a = val$keyword;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Word> call(Word word) {
            return word == null ? LookupEngine.m(this.f16373a) : rx.c.M2(word);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Callable<Word> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f16374a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f16375b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f16376c;

        public e(final Context val$context, final String val$keyword, final boolean val$needBook) {
            this.f16374a = val$context;
            this.f16375b = val$keyword;
            this.f16376c = val$needBook;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Word call() throws Exception {
            return i.f(this.f16374a, this.f16375b, this.f16376c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements Callable<Word> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f16377a;

        public f(final String val$keyword) {
            this.f16377a = val$keyword;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Word call() throws Exception {
            WordDictV2 wordDictV2;
            ResourceService.Client client = (ResourceService.Client) com.baicizhan.client.business.thrift.c.b().c("/rpc/resource_api");
            try {
                wordDictV2 = client.get_dict_by_word_v2(this.f16377a);
            } catch (LogicException e11) {
                if (e11.code != 3) {
                    throw e11;
                }
                wordDictV2 = client.get_dict_by_word_v2(this.f16377a.toLowerCase());
            }
            return LookupEngine.e(wordDictV2);
        }
    }

    public static Word d(SearchWordResultV2 online, String keyword) {
        Word word = new Word();
        word.setBookId(0);
        word.setId(String.valueOf(online.topic_id));
        word.setWord(online.word);
        word.setCnmean(online.mean_cn);
        word.setAccent(online.accent);
        word.setBase(true);
        word.setSearch(true);
        word.setFromNetwork(true);
        return word;
    }

    public static Word e(WordDictV2 onlineDict) {
        if (onlineDict == null) {
            return null;
        }
        WordBasicInfo word_basic_info = onlineDict.getWord_basic_info();
        Word word = new Word();
        word.setBookId(0);
        word.setId(String.valueOf(word_basic_info.topic_id));
        word.setWord(word_basic_info.word);
        word.setAccent(word_basic_info.getAccent_usa());
        word.setCnmean(WordMeanUtils.assembleCnMean(onlineDict.getChn_means()));
        word.setFromNetwork(true);
        return word;
    }

    public static List<Word> f(List<SearchWordResultV2> onlines, String keyword) {
        if (onlines == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(onlines.size());
        Iterator<SearchWordResultV2> it = onlines.iterator();
        while (it.hasNext()) {
            arrayList.add(d(it.next(), keyword));
        }
        return arrayList;
    }

    public static rx.c<Boolean> g(final Context context, final Word word) {
        return rx.c.j1(new a(context, word)).w5(bc0.c.e());
    }

    public static rx.c<Boolean> h(final Context context) {
        return rx.c.z2(new b(context)).w5(bc0.c.e());
    }

    public static void i(final Params output) {
        int i11 = 0;
        while (true) {
            if (i11 >= output.results.size()) {
                i11 = -1;
                break;
            } else if (output.results.get(i11).getWord().equalsIgnoreCase(output.keyword)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            Collections.swap(output.results, 0, i11);
        }
    }

    public static List<Word> j(Context context, Params params) {
        try {
            if (!o.a(context)) {
                qb.c.b("whiz", "search online, set token failed", new Object[0]);
                return null;
            }
            String str = params.keyword;
            if (str != null) {
                params.keyword = str.replace("\n", " ");
            }
            return f(((ResourceService.Client) com.baicizhan.client.business.thrift.c.b().c("/rpc/resource_api")).search_word_v2(params.keyword), params.keyword);
        } catch (Exception e11) {
            e11.printStackTrace();
            if (e11 instanceof TException) {
                int parseNetRelatedErrCode = ErrCodes.parseNetRelatedErrCode((TException) e11);
                params.errcode = parseNetRelatedErrCode;
                params.errmsg = ErrCodes.buildErrMessage(parseNetRelatedErrCode, e11.getMessage());
            }
            return null;
        }
    }

    public static rx.c<Params> k(final Context context, String keyword, int token, final int limit) {
        Params params = new Params();
        params.keyword = keyword;
        params.token = token;
        params.limit = limit;
        return rx.c.j1(new c(params, context)).w5(bc0.c.e());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        if (r6.token != 1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(android.content.Context r5, com.baicizhan.client.business.lookup.rx.LookupEngine.Params r6, qb0.g<? super com.baicizhan.client.business.lookup.rx.LookupEngine.Params> r7) {
        /*
            java.lang.String r0 = r6.keyword
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L15
            java.util.List r5 = p9.a.c(r5)
            r6.results = r5
            r7.onNext(r6)
            r7.onCompleted()
            return
        L15:
            java.lang.String r0 = "current_book_id"
            int r0 = i9.j.d(r0)
            java.lang.String r1 = r6.keyword
            int r2 = r6.limit
            java.util.List r0 = i9.i.g(r5, r0, r1, r2)
            if (r0 != 0) goto L2a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L2a:
            java.util.Iterator r1 = r0.iterator()
        L2e:
            boolean r2 = r1.hasNext()
            r3 = 1
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            com.baicizhan.client.business.lookup.Word r2 = (com.baicizhan.client.business.lookup.Word) r2
            java.lang.String r2 = r2.getWord()
            java.lang.String r4 = r6.keyword
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L2e
            goto L4c
        L48:
            int r1 = r6.token
            if (r1 == r3) goto L73
        L4c:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L53
            goto L73
        L53:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r6.results = r1
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L62
            r6.searching = r3
        L62:
            r7.onNext(r6)
            java.util.List r1 = j(r5, r6)
            if (r1 == 0) goto L7c
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L7c
            r0 = r1
            goto L7c
        L73:
            r6.searching = r3
            r7.onNext(r6)
            java.util.List r0 = j(r5, r6)
        L7c:
            r6.results = r0
            o(r5, r7, r6)
            r5 = 0
            r6.searching = r5
            r7.onNext(r6)
            r7.onCompleted()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.lookup.rx.LookupEngine.l(android.content.Context, com.baicizhan.client.business.lookup.rx.LookupEngine$Params, qb0.g):void");
    }

    public static rx.c<Word> m(final String keyword) {
        return rx.c.z2(new f(keyword)).w5(bc0.c.e());
    }

    public static rx.c<Word> n(final Context context, final String keyword, final boolean needBook) {
        return rx.c.z2(new e(context, keyword, needBook)).b2(new d(keyword)).w5(bc0.c.e());
    }

    public static void o(Context context, g<? super Params> subscriber, final Params output) {
        p(context, subscriber, output, true);
    }

    public static void p(Context context, g<? super Params> subscriber, final Params output, boolean retry) {
        if (output == null || output.results == null || TextUtils.isEmpty(output.keyword)) {
            return;
        }
        if (1 != output.token) {
            i(output);
            return;
        }
        Word word = null;
        for (Word word2 : output.results) {
            if (word2.getWord().equalsIgnoreCase(output.keyword)) {
                word = word2;
            }
        }
        if (word == null && retry) {
            output.searching = true;
            subscriber.onNext(output);
            output.results = j(context, output);
            p(context, subscriber, output, false);
        }
        i(output);
    }
}
