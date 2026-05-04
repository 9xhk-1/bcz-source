package com.baicizhan.main.wordlistv2.repo;

import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.main.wordlistv2.repo.db.WordListResourceRecord;
import com.baicizhan.online.resource_api.WordListWordMetaV2;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class e {
    @m80.k
    public static final WordListResourceRecord b(@m80.k WordListWordMetaV2 wordListWordMetaV2) {
        g0.p(wordListWordMetaV2, "<this>");
        int word_level_id = wordListWordMetaV2.topic_key.getWord_level_id();
        int topic_id = wordListWordMetaV2.topic_key.getTopic_id();
        String word = wordListWordMetaV2.word;
        g0.o(word, "word");
        String accent_usa_audio_uri = wordListWordMetaV2.accent_usa_audio_uri;
        g0.o(accent_usa_audio_uri, "accent_usa_audio_uri");
        String mean_cn = wordListWordMetaV2.mean_cn;
        g0.o(mean_cn, "mean_cn");
        return new WordListResourceRecord(word_level_id, topic_id, word, mean_cn, accent_usa_audio_uri);
    }

    public static final String c(int i11) {
        return "b_" + i11 + "_d_" + TimeUtil.getTodayEn();
    }
}
