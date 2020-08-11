import com.liferay.portal.service.*;
import com.liferay.portlet.journal.service.*

templates = JournalTemplateLocalServiceUtil.getTemplates();
println("Site Name # GroupURL # Template Name");
for(template in templates){
	group = GroupLocalServiceUtil.getGroup(template.getGroupId());
	println(group.getName()+ "# " + group.getFriendlyURL() + "#"+ template.getName());
}