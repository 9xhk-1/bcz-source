package f9;

import com.baicizhan.client.framework.network.http.HttpRequest;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f51328e = false;

    /* renamed from: f, reason: collision with root package name */
    public static final String f51329f = "[\\u00A0]+";

    /* renamed from: g, reason: collision with root package name */
    public static final String f51330g = "[^a-zA-Z'\\-]+";

    /* renamed from: h, reason: collision with root package name */
    public static final String f51331h = "[^a-zA-Z'\\-]+";

    /* renamed from: i, reason: collision with root package name */
    public static final double f51332i = 0.45d;

    /* renamed from: j, reason: collision with root package name */
    public static final double f51333j = 0.9d;

    /* renamed from: a, reason: collision with root package name */
    public f9.b f51334a = new f9.b();

    /* renamed from: b, reason: collision with root package name */
    public String f51335b;

    /* renamed from: c, reason: collision with root package name */
    public String f51336c;

    /* renamed from: d, reason: collision with root package name */
    public Collection<String> f51337d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: f9.a$a, reason: collision with other inner class name */
    public static class C0613a {

        /* renamed from: a, reason: collision with root package name */
        public int f51338a;

        /* renamed from: b, reason: collision with root package name */
        public double f51339b;

        public C0613a() {
        }

        public C0613a(int id2, double value) {
            this.f51338a = id2;
            this.f51339b = value;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f51340a;

        /* renamed from: b, reason: collision with root package name */
        public int f51341b;

        public b() {
        }

        public void a(int start, int end) {
            this.f51340a = start;
            this.f51341b = end;
        }

        public String toString() {
            return "Segment [start=" + this.f51340a + ", end=" + this.f51341b + "]";
        }

        public b(int start, int end) {
            a(start, end);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public static final Map<String, String> f51342a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public static final String[] f51343b;

        static {
            String[] strArr = {"be am is are was were being been", "one's my your her his our their", "oneself myself yourself herself himself ourselves yourselves themselves", "abide abode abided", "alight alighted alit", "arise arose arisen", "awake awoke awaked awoken", "bear bore born borned", "bid bade bidden", "bide bode bided", "bind bound", "blow blew blown", "break broke broken", "bring brought", "buy bought", "can could", "catch caught", "cleave clave cloven", "cling clung", "clothe clothed clad", "come came", "crow crowed crew", "dare dared durst", "dig dug", "do does did done", "draw drew drawn", "drink drank drunk", "drive drove driven", "eat ate eaten", "fall fell fallen", "feed fed", "feel felt", "fight fought", "find found", "fling flung", "fly flew flown", "freeze froze frozen", "get got gotten", "give gave given", "go went gone", "grind ground", "grow grew g rown", "hang hung hanged", "have has had", "heave heaved hove", "hold held", "keep kept", "know knew known", "lay laid", "lead led", "leave left", "lie lied lay lain", "light lit", "make made", "may might", "meet met", "pay paid", "reave reaved reft", "reeve rove reeved", "ride rode ridden", "ring rang rung", "rise rose risen", "run ran", "say said", "see saw seen", "seek sought", "sell sold", "shake shook shaken", "shall should", "shine shone shined", "sing sang sung", "sink sank sunk ", "sit sat", "slay slew slain", "sleep slept", "sling slung", "slink slunk", "smite smote smitten", "speak spoke spoken", "spin spun", "spit spat", "stand stood", "stave staved stove", "steal stole stolen", "stick stuck", "sting stung", "stink stank stunk", "swear swore sworn", "swim swam swum", "swing swung", "take took taken", "teach taught", "tear tore torn", "tell told", "think thought", "tread trod trodden", "wake woke woken", "wear wore worn", "weave wove woven", "weep wept", "will would", "win won", "wind wound", "wit wist", "wring wrung wrung", "mouse mice", "carry carried", "lose lost", "worry worries", "look looked", "shrink shrank shrunk", "foot feet"};
            f51343b = strArr;
            for (String str : strArr) {
                try {
                    String[] split = str.split(" ");
                    for (String str2 : split) {
                        if (str2 != null && !str2.trim().isEmpty()) {
                            f51342a.put(str2.trim(), split[0].trim());
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }

        public static boolean a(String srcWord, String sentenceWord) {
            String str = f51342a.get(sentenceWord);
            return str != null && str.equals(srcWord);
        }

        public static String b(String s11) {
            return f51342a.get(s11);
        }
    }

    public a(String sentence, String word, Collection<String> variants) {
        this.f51335b = sentence;
        this.f51336c = word;
        this.f51337d = variants;
    }

    public static List<b> h(String sentence, String word, Collection<String> variants) {
        return new a(sentence, word, variants).b();
    }

    public final List<b> a(String sentence, String[] mainWords, List<Integer> possibleIds) {
        if (sentence == null || mainWords == null || possibleIds == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Pattern compile = Pattern.compile("[^a-zA-Z'\\-]+");
        Pattern compile2 = Pattern.compile("[^a-zA-Z'\\-]+");
        for (Integer num : possibleIds) {
            if (num.intValue() >= 0 && num.intValue() < mainWords.length) {
                Matcher matcher = compile.matcher(sentence);
                boolean z11 = false;
                for (int i11 = 0; i11 < num.intValue(); i11++) {
                    if (matcher.find()) {
                        z11 = true;
                    }
                }
                if (z11 || num.intValue() <= 0) {
                    String str = mainWords[num.intValue()];
                    int end = !z11 ? 0 : matcher.end();
                    int i12 = end;
                    boolean z12 = false;
                    int i13 = i12;
                    while (end < sentence.length()) {
                        String str2 = "" + sentence.charAt(end);
                        if (compile.matcher(str2).matches()) {
                            break;
                        }
                        if (compile2.matcher(str2).matches()) {
                            if (z12) {
                                break;
                            }
                        } else if (!z12) {
                            i13 = end;
                            z12 = true;
                        }
                        end++;
                        i12++;
                    }
                    if (i13 >= 0 && i12 <= sentence.length()) {
                        b bVar = new b(i13, i12);
                        if (f51328e) {
                            System.out.printf("id2seg: %s => %s\n", str, bVar);
                        }
                        arrayList.add(bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<b> b() {
        String str;
        String str2;
        if (this.f51335b != null && (str2 = this.f51336c) != null && !str2.isEmpty()) {
            char[] charArray = this.f51336c.toCharArray();
            int length = charArray.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (charArray[i11] > 127) {
                    int indexOf = this.f51335b.toLowerCase().indexOf(this.f51336c.toLowerCase());
                    if (indexOf >= 0) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new b(indexOf, this.f51336c.length() + indexOf));
                        return arrayList;
                    }
                } else {
                    i11++;
                }
            }
        }
        i();
        String str3 = this.f51335b;
        if (str3 == null || str3.isEmpty() || (str = this.f51336c) == null || str.isEmpty()) {
            return null;
        }
        Collection<String> collection = this.f51337d;
        if (collection != null && !collection.isEmpty()) {
            Iterator<String> it = this.f51337d.iterator();
            while (it.hasNext()) {
                List<b> d11 = d(this.f51335b, it.next());
                if (d11 != null && !d11.isEmpty()) {
                    return d11;
                }
            }
        }
        return g(this.f51335b, this.f51336c);
    }

    public final boolean c(List<List<Integer>> list, int level, Integer[] path) {
        if (level >= list.size()) {
            return true;
        }
        List<Integer> list2 = list.get(level);
        int intValue = path[level - 1].intValue();
        for (Integer num : list2) {
            if (num.intValue() > intValue) {
                path[level] = num;
                if (level >= list.size() - 1) {
                    return true;
                }
                return c(list, level + 1, path);
            }
        }
        return false;
    }

    public final List<b> d(String sentence, String sub) {
        String[] k11;
        String[] split;
        boolean z11;
        if (sentence == null || sub == null || (k11 = k(sentence)) == null || k11.length == 0 || (split = sub.split("[^a-zA-Z'\\-]+")) == null || split.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (split.length != 1) {
            int length = split.length;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                String str = split[i11];
                int i13 = i12;
                while (true) {
                    if (i13 >= k11.length) {
                        z11 = false;
                        break;
                    }
                    String str2 = k11[i13];
                    if (str2 != null && str2.equals(str)) {
                        arrayList.add(Integer.valueOf(i13));
                        z11 = true;
                        i12 = i13;
                        break;
                    }
                    i13++;
                }
                if (!z11) {
                    arrayList.clear();
                    break;
                }
                i11++;
            }
        } else {
            String str3 = split[0];
            for (int i14 = 0; i14 < k11.length; i14++) {
                String str4 = k11[i14];
                if (str4 != null && str4.equals(str3)) {
                    arrayList.add(Integer.valueOf(i14));
                }
            }
        }
        return a(sentence, k11, arrayList);
    }

    public final int e(String[] mainWords, int startId, int endId, String s11, final double similarThreshold) {
        List<Integer> f11 = f(mainWords, startId, endId, s11, similarThreshold);
        if (f11 == null || f11.isEmpty()) {
            return -1;
        }
        return f11.get(0).intValue();
    }

    public final List<Integer> f(String[] mainWords, int startId, int endId, String s11, final double similarThreshold) {
        int i11;
        int i12;
        a aVar = this;
        String str = s11;
        ArrayList arrayList = new ArrayList();
        int i13 = startId;
        double d11 = 0.0d;
        int i14 = 0;
        while (i13 < endId) {
            String str2 = mainWords[i13];
            if (str2 != null && !str2.isEmpty()) {
                if (c.a(str, str2)) {
                    if (f51328e) {
                        System.out.printf("%s <=> %s\n", str2, str);
                    }
                    if (Math.abs(d11 - 1.0d) < 1.0E-6d) {
                        arrayList.add(Integer.valueOf(i13));
                    } else if (1.0d > d11) {
                        arrayList.clear();
                        arrayList.add(Integer.valueOf(i13));
                        d11 = 1.0d;
                    }
                } else {
                    int length = str2.length();
                    int length2 = str.length();
                    int c11 = aVar.f51334a.c(str2, str);
                    double d12 = c11 * 1.0d;
                    i11 = i13;
                    double d13 = d12 / length;
                    double d14 = length2;
                    double pow = d13 * Math.pow(d12 / d14, 2.0d);
                    if (str2.endsWith("ing")) {
                        String replaceAll = str2.replaceAll("ing$", "");
                        int c12 = aVar.f51334a.c(replaceAll, str);
                        double d15 = c12 * 1.0d;
                        double length3 = (d15 / replaceAll.length()) * (d15 / d14);
                        if (f51328e) {
                            System.out.println(str2 + " ==> ing replace = " + replaceAll + ":" + pow + ":" + length3);
                        }
                        c11 = Math.max(c11, c12);
                        pow = Math.max(pow, length3);
                    }
                    int i15 = c11;
                    boolean z11 = pow > d11 - 1.0E-6d && pow >= similarThreshold;
                    if (f51328e) {
                        i12 = i15;
                        System.out.printf("fuzzy-find: %s => %s [%d] [old[%d %g] new[%d %g]] %s\n", s11, mainWords[i11], Integer.valueOf(i15), -1, Double.valueOf(d11), Integer.valueOf(i11), Double.valueOf(pow), z11 ? "[replaced]" : "");
                    } else {
                        i12 = i15;
                    }
                    if (z11) {
                        if (Math.abs(pow - d11) < 1.0E-6d) {
                            arrayList.add(Integer.valueOf(i11));
                        } else if (pow > d11) {
                            arrayList.clear();
                            arrayList.add(Integer.valueOf(i11));
                            d11 = pow;
                            i14 = i12;
                        }
                    }
                    i13 = i11 + 1;
                    aVar = this;
                    str = s11;
                }
            }
            i11 = i13;
            i13 = i11 + 1;
            aVar = this;
            str = s11;
        }
        if (d11 < similarThreshold) {
            return null;
        }
        if (i14 >= 2 || d11 > 0.9d) {
            return arrayList;
        }
        return null;
    }

    public final List<b> g(String sentence, String sub) {
        a aVar;
        if (sentence != null && sub != null) {
            String[] k11 = k(sentence);
            if (k11 != null && k11.length != 0) {
                String[] split = sub.split("[^a-zA-Z'\\-]+");
                if (split != null && split.length != 0) {
                    ArrayList arrayList = new ArrayList();
                    if (split.length == 1) {
                        String str = split[0];
                        int i11 = 0;
                        while (i11 < k11.length) {
                            int i12 = i11 + 1;
                            int e11 = e(k11, i11, i12, str, 0.9d);
                            if (e11 >= 0 && e11 < k11.length) {
                                arrayList.add(Integer.valueOf(e11));
                            }
                            i11 = i12;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        for (String str2 : split) {
                            List<Integer> f11 = f(k11, 0, k11.length, str2, 0.45d);
                            if (f11 != null && !f11.isEmpty()) {
                                arrayList2.add(f11);
                            }
                        }
                        aVar = this;
                        List<Integer> j11 = j(arrayList2);
                        if (j11 != null) {
                            arrayList.addAll(j11);
                        }
                    } else {
                        aVar = this;
                    }
                    if (arrayList.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList();
                        for (String str3 : split) {
                            List<Integer> f12 = aVar.f(k11, 0, k11.length, str3, 0.0d);
                            if (f12 != null && !f12.isEmpty()) {
                                arrayList3.add(f12);
                            }
                        }
                        List<Integer> j12 = j(arrayList3);
                        if (j12 != null) {
                            arrayList.addAll(j12);
                        }
                    }
                    if (f51328e) {
                        System.out.println("fuzzy-result:" + arrayList);
                    }
                    return a(sentence, k11, arrayList);
                }
            }
        }
        return null;
    }

    public final void i() {
        String str = this.f51335b;
        if (str != null) {
            String replace = str.replace(u0.f91728x, '\'');
            this.f51335b = replace;
            String replace2 = replace.replace(HttpRequest.f17578o, GlideException.a.f28776d);
            this.f51335b = replace2;
            String replace3 = replace2.replace(" '", GlideException.a.f28776d).replace("' ", GlideException.a.f28776d);
            this.f51335b = replace3;
            this.f51335b = replace3.toLowerCase();
        }
        String str2 = this.f51336c;
        if (str2 != null) {
            String replace4 = str2.replace(u0.f91728x, '\'');
            this.f51336c = replace4;
            String replaceAll = replace4.replaceAll(f51329f, " ");
            this.f51336c = replaceAll;
            String replaceAll2 = replaceAll.replaceAll("\\([^\\)]+\\)", "");
            this.f51336c = replaceAll2;
            String trim = replaceAll2.trim();
            this.f51336c = trim;
            this.f51336c = trim.toLowerCase();
        }
        Collection<String> collection = this.f51337d;
        if (collection != null && !collection.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = this.f51337d.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().replaceAll(f51329f, " ").trim().toLowerCase());
            }
            this.f51337d = arrayList;
        }
        if (f51328e) {
            System.out.println("prepare: " + this.f51335b);
            System.out.println("prepare: " + this.f51336c);
            System.out.println("prepare: " + this.f51337d);
        }
    }

    public final List<Integer> j(List<List<Integer>> list) {
        if (list == null) {
            return null;
        }
        try {
            if (list.isEmpty()) {
                return null;
            }
            int i11 = Integer.MAX_VALUE;
            Integer[] numArr = null;
            for (Integer num : list.get(0)) {
                Integer[] numArr2 = new Integer[list.size()];
                numArr2[0] = num;
                if (c(list, 1, numArr2)) {
                    try {
                        int intValue = numArr2[list.size() - 1].intValue() - numArr2[0].intValue();
                        if (intValue < i11) {
                            i11 = intValue;
                            numArr = numArr2;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            if (numArr == null) {
                return null;
            }
            return Arrays.asList(numArr);
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String[] k(String sentense) {
        String[] split = this.f51335b.split("[^a-zA-Z'\\-]+");
        if (split == null || split.length == 0) {
            return null;
        }
        for (int i11 = 0; i11 < split.length; i11++) {
            split[i11] = split[i11].replaceAll("[^a-zA-Z'\\-]+", "");
        }
        return split;
    }
}
