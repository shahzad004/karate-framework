package runners;

import java.util.ArrayList;
import java.util.List;

public class FeaturePathReader {

    public List<String> featurePaths;

    public FeaturePathReader() {
        this.featurePaths = new ArrayList<>();
        loadFeaturesPaths();
    }

    private void loadFeaturesPaths() {
        featurePaths.add("classpath:features/users.feature");
        featurePaths.add("classpath:features/postuser.feature");
        featurePaths.add("classpath:features/putuser.feature");
        featurePaths.add("classpath:features/deleteuser.feature");
        featurePaths.add("classpath:features/creategetupdatedelete.feature");
        featurePaths.add("classpath:features/bookstore/bookstore.feature");
        featurePaths.add("classpath:features/bookstore/generateusertoken.feature");
    }

    public List<String> getFeaturePaths() {
        return featurePaths;
    }

    public void setFeaturePaths(List<String> featurePaths) {
        this.featurePaths = featurePaths;
    }
}
