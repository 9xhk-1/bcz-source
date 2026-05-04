package h1;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f57952a = JsonReader.a.a("nm", "mm", "hd");

    public static MergePaths a(JsonReader jsonReader) throws IOException {
        String str = null;
        boolean z11 = false;
        MergePaths.MergePathsMode mergePathsMode = null;
        while (jsonReader.k()) {
            int S = jsonReader.S(f57952a);
            if (S == 0) {
                str = jsonReader.E();
            } else if (S == 1) {
                mergePathsMode = MergePaths.MergePathsMode.forId(jsonReader.w());
            } else if (S != 2) {
                jsonReader.U();
                jsonReader.V();
            } else {
                z11 = jsonReader.q();
            }
        }
        return new MergePaths(str, mergePathsMode, z11);
    }
}
