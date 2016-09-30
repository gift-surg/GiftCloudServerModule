GIFT-Cloud Server
-----------------

GIFT-Cloud is a secure data storage and collaboration platform for medical imaging research.

GiftCloudServerModule is an XNAT module containing XNAT customisations specific to GIFT-Cloud.
It is used in conjunction with GiftCloudServerBuilder to install a GIFT-Cloud Server.

A pre-build jar of GiftCloudServerModule is included in the GiftCloudServerBuilder codebase. Therefore, you do not need to use the GiftCloudServerModule 
repository unless you wish to provide further customisations to GIFT-Cloud.

Authors: Tom Doel and Dzhoshkun Shakir, [Translational Imaging Group][tig], [Centre for Medical Image Computing][cmic], [University College London (UCL)][ucl].
GIFT-Cloud was developed as part of the [GIFT-Surg][giftsurg] project. 
If you use this software, please cite [this paper][citation]. 

GIFT-Cloud Server extends the [XNAT][xnat] system developed by Harvard University / Howard Hughes Medical Institute (HHMI) / Washington University.



Disclaimer
----------

 * GIFT-Cloud and XNAT are not certified for clinical use.


Software links
--------------

 - [GitHub mirror][githubhome].
 - [XNAT][xnat]
 - [XNAT 1.6 documentation][xnatdocumentation]
 - [XNAT 1.6 installation instructions][xnatinstall]
 - [XNAT 1.6 prerequisites][xnatprerequisites]
 - [XNAT working with modules][xnatmodule]
 - [XNAT discussion group][xnatdiscussion]
 

License
-------

Copyright (c) 2014-2016, [University College London][ucl].

GIFT-Cloud is available as free open-source software under a BSD 3-Clause License.
Parts of GIFT-Cloud derive from XNAT
 - [XNAT][xnat] (Harvard University / Howard Hughes Medical Institute (HHMI) / Washington University) uses the BSD 2-Clause License



System requirements
-------------------

GIFT-Cloud Server runs a customised version of XNAT. Please see [XNAT 1.6 prerequisites][xnatprerequisites].

GIFT-Cloud Server can be installed on Linux, macOS or Windows.

GIFT-Cloud Server requires:
 * PostgreSQL 9.1 or later
 * Oracle Java SDK 1.7
 * Apache Tomcat 7.0

Depending on how you intend to deploy GIFT-Cloud Server, you may also need to configure a firewall, Apache daemon, SSL certificates, system backups etc.


Installation
------------

Please use the repository GiftCloudServerBuilder to install a GIFT-Cloud Server.

GiftCloudServerBuilder include a pre-built jar of the GiftCloudServerModule jar - this is found in GiftCloudServerBuilder/modules/uk.ac.ucl.cmic.tig.gift-surg-datastore-GC-<<VERSION>>.jar.
When you run the setup or update scripts to deploy/update the XNAT (GIFT-Cloud) server, the module jar will automatically be detected and deployed.
	
If you wish to modify GiftCloudServerModule (for example, if you want to modify the XNAT user interface), you should follow the [XNAT Module][xnatmodule] procedures. In summary, you need to do the following:
 * Make the appropriate modifications to GiftCloudServerModule and modify the names and version numbers in the two pom files
 * Delete the pre-built jar provided in GiftCloudServerBuilder/modules/uk.ac.ucl.cmic.tig.gift-surg-datastore-GC-<<VERSION>>.jar
 * Run `mvn clean package` to build a new jar
 * Copy the new jar from GiftCloudServerModule/datastore/target/uk.ac.ucl.cmic.tig.gift-surg-datastore-GC-<<VERSION>>.jar to GiftCloudServerBuilder/modules
	 (Replace <<VERSION>> with the version number in the pom files)
 * Run the `update -Ddeploy=true` script 
 



Issues
------

If you experience installation issues, they will almost certainly be related to your configuration of XNAT, Java, Tomcat or PostgreSQL. The best way to resolve these is through the XNAT support resources:
 * Check the [XNAT Module documentation][xnatmodule]
 * Check the [XNAT documentation][xnatdocumentation];
 * Search the [XNAT discussion group][xnatdiscussion] as your issue will often have been reported by someone else;
 * If you can't find a solution, post a new message in the [XNAT discussion group][xnatdiscussion] and explain that you are installing a customised version of XNAT 1.6.
 





Funding
-------

GIFT-Cloud is part of GIFT-Surg. [GIFT-Surg][[giftsurg] was supported through an Innovative Engineering for Health award by the [Wellcome Trust][wellcometrust] [WT101957], the [Engineering and Physical Sciences Research Council (EPSRC)][epsrc] [NS/A000027/1] and a [National Institute for Health Research][nihr] Biomedical Research Centre [UCLH][uclh]/UCL High Impact Initiative.


[tig]: http://cmictig.cs.ucl.ac.uk
[giftsurg]: http://www.gift-surg.ac.uk
[cmic]: http://cmic.cs.ucl.ac.uk
[ucl]: http://www.ucl.ac.uk

[wellcometrust]: http://www.wellcome.ac.uk
[epsrc]: http://www.epsrc.ac.uk
[nihr]: http://www.nihr.ac.uk/research
[uclh]: http://www.uclh.nhs.uk

[citation]: http://www.gift-surg.ac.uk/media-engagement/academic-journals/
[githubhome]: https://github.com/gift-surg/GiftCloudServerBuilder

[xnat]: https://www.xnat.org
[xnatinstall]: https://wiki.xnat.org/display/XNAT16/XNAT+1.6+Installation+Guide
[xnatprerequisites]: https://wiki.xnat.org/display/XNAT16/Prerequisites
[xnatbuilder]: https://bitbucket.org/nrg/xnat_builder_1_6dev
[xnatmodule]: https://wiki.xnat.org/display/XNAT16/Developing+Modules
[xnatdocumentation]: https://wiki.xnat.org/display/XNAT16/Home
[xnatdiscussion]: http://groups.google.com/group/xnat_discussion

