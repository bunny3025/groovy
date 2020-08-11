import com.liferay.portal.service.*;
import com.liferay.portlet.journal.service.*

templates = JournalTemplateLocalServiceUtil.getTemplates();
println("Site Name # Structure Name # Template Name");
for(template in templates){
	try{
		group = GroupLocalServiceUtil.getGroup(template.getGroupId());
		structure = JournalStructureLocalServiceUtil.getStructure(template.getGroupId(), template.getStructureId());
		println(group.getName()+ " # " + template.getName() + " # " +structure.getName());
	} catch (Exception e) {
		println(e);
	}
}