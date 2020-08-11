import com.liferay.portal.kernel.model.Release;
import com.liferay.portal.kernel.service.ReleaseLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException
 
try {
    Release release = ReleaseLocalServiceUtil.getRelease(1706597);
    release.setSchemaVersion("4.1.4");
    ReleaseLocalServiceUtil.updateRelease(release);
} catch (PortalException e) {
    print(e)
}