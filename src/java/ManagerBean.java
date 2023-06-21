
import com.ats.ApplicationTrackingSystem.ApplicationBeans.ApplicationBean;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@SessionScoped
public class ManagerBean implements Serializable {

    private boolean showApp;
    private List<ApplicationBean> applications;

    public boolean isShowApp() {
        return showApp;
    }

    public void setShowApp(boolean showaApp) {
        this.showApp = showaApp;
    }

    public List<ApplicationBean> getApplications() {
        return applications;
    }

    public void setApplications(List<ApplicationBean> applications) {
        this.applications = applications;
    }

    @PostConstruct
    public void init() {
//        if (applications.isEmpty() || applications == null) {
      this.showApp = false;
//        } else {
//            this.showApp = true;
//        }
    }
//      public String login() {
//        if (this.username.isEmpty() || this.password.isEmpty()) {
//            out.println("Null Valuesss");
//        }
//        try {
//            int valid = loginManager.validate(this.username, this.password);
//            if (valid > 0) {
//                out.println(valid);
//
//                return "home";
//            } else {
//                return null;
//            }
//        } catch (NotFoundException | DatabaseInconsistentStateException ex) {
//            out.println("Erooooooor" + ex.getMessage());
//            return "login";
//        }
//    }

}
