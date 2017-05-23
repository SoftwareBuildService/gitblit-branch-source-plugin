package com.tsystems.sbs.gitblitbranchsource;

import org.kohsuke.accmod.Restricted;
import org.kohsuke.accmod.restrictions.NoExternalUse;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.QueryParameter;

import hudson.Extension;
import hudson.Util;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;
import hudson.util.FormValidation;

public class Endpoint extends AbstractDescribableImpl<Endpoint> {
	private final String name;
	private final String apiUri;
	
	@DataBoundConstructor
	public Endpoint(String apiUri,String name){
		this.apiUri = Util.fixEmptyAndTrim(apiUri);
		this.name = Util.fixEmptyAndTrim(name);
	}
	
	public String getApiUri() {
		return apiUri;
	}
	
	public String getName() {
		return name;
	}
	
	@Extension
	public static class DescriptorImpl extends Descriptor<Endpoint> {

		@Override
		public String getDisplayName() {
			return "";
		}
		
		@Restricted(NoExternalUse.class)
		public FormValidation doCheckApiUri(@QueryParameter String apiUri) {
			//TODO: form validation (apiUri)
			return FormValidation.ok();
		}
		
		@Restricted(NoExternalUse.class)
		public FormValidation doCheckName(@QueryParameter String name){
			//TODO: form validation (name) 
			return FormValidation.ok();
		}
		
	}
	
}