package ${package}.pages;

import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation;

import ${package}.configuration.Permissions;

@SuppressWarnings("serial")
@AuthorizeInstantiation(Permissions.ACCESS_HOMEPAGE)
public class SamplePage extends TemplatePage {

}
