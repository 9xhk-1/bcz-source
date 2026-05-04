package com.baicizhan.main.wikiv2.lookup.wikiv2.helper;

import a00.h0;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l3.i0;
import m00.c;
import m80.k;
import m80.l;
import pn.j;
import u30.f0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSentenceTagHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceTagHelper.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/helper/SentenceTagHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,176:1\n1761#2,3:177\n1761#2,3:180\n1761#2,3:183\n1761#2,3:186\n295#2,2:189\n*S KotlinDebug\n*F\n+ 1 SentenceTagHelper.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/helper/SentenceTagHelper\n*L\n111#1:177,3\n115#1:180,3\n118#1:183,3\n150#1:186,3\n157#1:189,2\n*E\n"})
/* loaded from: classes3.dex */
public final class SentenceTagHelper {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final SentenceTagHelper f25653a = new SentenceTagHelper();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final List<String> f25654b = h0.Q("中考", "高考", "四级", "六级", "考研", "雅思", "托福", "剑", "TPO", "SAT", "GRE", "GMAT", "英语一", "英语二");

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final List<String> f25655c = h0.Q("《牛津词典》", "大西洋", "帝国理工学院报刊", "福布斯", "哈佛商业评论", "赫芬顿邮报", "华盛顿邮报", "今日美国", "今日心理学", "经济学人", "科学美国人", "路透社", "每日电讯", "每日电讯报", "每日邮报", "美联社", "南华早报", "内幕网", "纽约时报", "纽约邮报", "欧洲新闻电视台", "澎湃新闻英文版", "彭博社", "人物", "时代周刊", "泰晤士报", "卫报", "悉尼先驱晨报", "英国广播公司", "中国国际电视台", "ABC News", "AP News", "AP/Physics", "Ars Technica", "Associated Press", "Axios", "BBC", "Bloomberg", "BMO", "Business Insider", "CBS News", "CGTN", "Chemistry World", "Chuck Murry", "CNN", "Dailymail", "Economist", "Euronews", "euronews.next", "Forbes", "forge.medium", "Fortune", "Fox News", "Glamour", "Harvard Business Review", "Health", "Huffington Post", "Huffpost", "IEEE Spectrum", "IMOK", "Imperial News", "Insider", "JMO", "Melvin Sanicas", "Mental Health Today", "Mia Nacamulli", "Molly Stevens", "NASASpaceflight.com", "National Review", "NBC News", "New Atlas", "New York Post", "Newsela", "People", "Popular Science", "PsychologyToday", "Reuters", "British Broadcasting Corporation", "Salon", "science", "Scientific American", "SciTech Daily", "SIX TONE", "Sixth Tone", "Smithsonian Magazine", "Sourcing Journal", "South China Morning Post", "Sportico.com", "Steven Zheng", "Sunset Magazine", "The Telegeraph", "The Atlantic", "The British Psychological Society Research Digest", "The Christian Science Monitor", "The Economist", "The Enquirer", "The Guardian", "The Mercury News", "The New York Times", "The New Yorker", "The Sydney Morning Herald", "The Telegerap", "The Times", "The Verge", "The Wall Street Journal", "The Washington Post", "TIME", "Times", "USA Today", "Verywell Health", "Verywell Mind", "Wall Street Journal", "Washington Post", "wired", "WIRED", "WSJ", "WWD", "Yahoo Finance");

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final List<String> f25656d = h0.Q("阿甘正传", "爱丽丝梦游仙境", "安德的游戏", "傲骨贤妻", "宝贝老板", "保姆日记", "贝拉的魔法", "比佛利拜金狗", "变形金刚", "超凡蛛侠", "穿普拉达的女王", "大话王", "大鱼", "盗梦空间", "绯闻女孩", "风雨哈佛路", "富贵吉娃娃", "钢铁侠", "公主日记", "公主新娘", "古战场传奇", "哈利·波特", "哈利波特", "哈姆雷特", "豪斯医生", "和莎莫的500天", "黑豹", "灰姑娘的故事", "急诊室的故事", "叫我第一名", "金装律师", "惊奇队长", "绝望的主妇", "老爸老妈浪漫史", "老友记", "雷神", "良医", "罗马假日", "妈妈咪呀", "马利和我", "漫威", "美国队长", "摩登家庭", "魔法灰姑娘", "暮光之城", "牛仔裤的夏天", "破产姐妹", "奇异博士", "人生遥控器", "社交网络", "神探夏洛克", "生活大爆炸", "十月的天空", "实习生", "实习医生格蕾", "实习医生格蕾第", "鼠来宝", "死亡诗社", "唐顿庄园", "天伦之旅", "天生一对", "我们所知道的生活", "无敌浩克", "夏洛特的网", "消失的爱人", "小屁孩日记", "小谢尔顿", "肖申克的救赎", "心灵捕手", "星尘", "星际穿越", "星运里的错", "阳光小美女", "遗愿清单", "蚁人", "音乐之声", "银河护卫队", "与霍金一起了解宇宙", "宇宙的奇迹", "真爱至上", "蜘蛛侠", "朱莉与朱莉娅", "BBC宇宙的奇迹", "K歌情人");

    /* renamed from: e, reason: collision with root package name */
    public static final int f25657e = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SentenceTagType {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ SentenceTagType[] $VALUES;
        public static final SentenceTagType DEFAULT = new SentenceTagType("DEFAULT", 0);
        public static final SentenceTagType RHYME = new SentenceTagType("RHYME", 1);
        public static final SentenceTagType CONTEXT = new SentenceTagType("CONTEXT", 2);
        public static final SentenceTagType FOREIGN_MEDIA = new SentenceTagType("FOREIGN_MEDIA", 3);
        public static final SentenceTagType EXAM = new SentenceTagType("EXAM", 4);

        private static final /* synthetic */ SentenceTagType[] $values() {
            return new SentenceTagType[]{DEFAULT, RHYME, CONTEXT, FOREIGN_MEDIA, EXAM};
        }

        static {
            SentenceTagType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c.c($values);
        }

        private SentenceTagType(String str, int i11) {
        }

        @k
        public static m00.a<SentenceTagType> getEntries() {
            return $ENTRIES;
        }

        public static SentenceTagType valueOf(String str) {
            return (SentenceTagType) Enum.valueOf(SentenceTagType.class, str);
        }

        public static SentenceTagType[] values() {
            return (SentenceTagType[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final int f25658c = 0;

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SentenceTagType f25659a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f25660b;

        public a(@k SentenceTagType type, @k String text) {
            g0.p(type, "type");
            g0.p(text, "text");
            this.f25659a = type;
            this.f25660b = text;
        }

        public static /* synthetic */ a d(a aVar, SentenceTagType sentenceTagType, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                sentenceTagType = aVar.f25659a;
            }
            if ((i11 & 2) != 0) {
                str = aVar.f25660b;
            }
            return aVar.c(sentenceTagType, str);
        }

        @k
        public final SentenceTagType a() {
            return this.f25659a;
        }

        @k
        public final String b() {
            return this.f25660b;
        }

        @k
        public final a c(@k SentenceTagType type, @k String text) {
            g0.p(type, "type");
            g0.p(text, "text");
            return new a(type, text);
        }

        @k
        public final String e() {
            return this.f25660b;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f25659a == aVar.f25659a && g0.g(this.f25660b, aVar.f25660b);
        }

        @k
        public final SentenceTagType f() {
            return this.f25659a;
        }

        public int hashCode() {
            return (this.f25659a.hashCode() * 31) + this.f25660b.hashCode();
        }

        @k
        public String toString() {
            return "SentenceTag(type=" + this.f25659a + ", text=" + this.f25660b + j.f81007d;
        }
    }

    @k
    public final String a(@k String source) {
        g0.p(source, "source");
        if (source.length() == 0) {
            return "";
        }
        if (f0.J2(source, "来源：", false, 2, null) || f0.J2(source, "来源:", false, 2, null)) {
            return source;
        }
        return "来源：" + source;
    }

    @l
    public final String b(@k String source) {
        Object obj;
        g0.p(source, "source");
        Iterator<T> it = f25654b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (k0.k3(source, (String) obj, true)) {
                break;
            }
        }
        return (String) obj;
    }

    @k
    public final List<a> c(@k i0.w sentence) {
        boolean z11;
        boolean z12;
        g0.p(sentence, "sentence");
        ArrayList arrayList = new ArrayList();
        String j02 = sentence.j0();
        boolean z13 = true;
        boolean z14 = sentence.f0().length() > 0 || sentence.V().length() > 0 || sentence.b0().length() > 0;
        boolean z15 = sentence.H().length() > 0 || sentence.F().length() > 0;
        List<String> list = f25656d;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (k0.k3(j02, (String) it.next(), true)) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        boolean z16 = z15 || z11;
        List<String> list2 = f25655c;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (k0.k3(j02, (String) it2.next(), true)) {
                    z12 = true;
                    break;
                }
            }
        }
        z12 = false;
        List<String> list3 = f25654b;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                if (k0.k3(j02, (String) it3.next(), true)) {
                    break;
                }
            }
        }
        z13 = false;
        if (z14) {
            arrayList.add(new a(SentenceTagType.RHYME, "押韵"));
        }
        if (z16) {
            arrayList.add(new a(SentenceTagType.CONTEXT, "语境"));
        }
        if (z12) {
            arrayList.add(new a(SentenceTagType.FOREIGN_MEDIA, "外刊"));
        }
        if (z13) {
            arrayList.add(new a(SentenceTagType.EXAM, "真题"));
        }
        if (arrayList.isEmpty() && j02.length() == 0) {
            arrayList.add(new a(SentenceTagType.DEFAULT, "自研"));
        }
        return arrayList;
    }

    public final boolean d(@k String source) {
        g0.p(source, "source");
        List<String> list = f25654b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (k0.k3(source, (String) it.next(), true)) {
                return true;
            }
        }
        return false;
    }
}
