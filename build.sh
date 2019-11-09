#Entra
cd /home/alex/.m2/repository/br/com
rm * -rf
sleep 20s
#core
mvn clean -f "/ambiente/eclipse/workspace-erp/core/core/pom.xml"
mvn package -f "/ambiente/eclipse/workspace-erp/core/core/pom.xml"
mvn install -f "/ambiente/eclipse/workspace-erp/core/core/pom.xml"
sleep 10s
#domain
mvn clean -f "/ambiente/eclipse/workspace-erp/domain/domain/pom.xml"
mvn package -f "/ambiente/eclipse/workspace-erp/domain/domain/pom.xml"
mvn install -f "/ambiente/eclipse/workspace-erp/domain/domain/pom.xml"
sleep 10s
#base
mvn clean -f "/ambiente/eclipse/workspace-erp/base/base/pom.xml"
mvn package -f "/ambiente/eclipse/workspace-erp/base/base/pom.xml"
mvn install -f "/ambiente/eclipse/workspace-erp/base/base/pom.xml"
sleep 10s
#fiscal
mvn clean -f "/ambiente/eclipse/workspace-erp/fiscal/fiscal/pom.xml"
mvn package -f "/ambiente/eclipse/workspace-erp/fiscal/fiscal/pom.xml"
mvn install -f "/ambiente/eclipse/workspace-erp/fiscal/fiscal/pom.xml"
sleep 10s
#seguranca
mvn clean -f "/ambiente/eclipse/workspace-erp/seguranca/seguranca/pom.xml"
mvn package -f "/ambiente/eclipse/workspace-erp/seguranca/seguranca/pom.xml"
mvn install -f "/ambiente/eclipse/workspace-erp/seguranca/seguranca/pom.xml"
sleep 10s
#calculos
mvn clean -f "/ambiente/eclipse/workspace-erp/calculos/calculos/pom.xml"
mvn package -f "/ambiente/eclipse/workspace-erp/calculos/calculos/pom.xml"
mvn install -f "/ambiente/eclipse/workspace-erp/calculos/calculos/pom.xml"
sleep 10s
#financeiro
mvn clean -f "/ambiente/eclipse/workspace-erp/financeiro/financeiro/pom.xml"
mvn package -f "/ambiente/eclipse/workspace-erp/financeiro/financeiro/pom.xml"
mvn install -f "/ambiente/eclipse/workspace-erp/financeiro/financeiro/pom.xml"
sleep 10s
#comercial
mvn clean -f "/ambiente/eclipse/workspace-erp/comercial/comercial/pom.xml"
mvn package -f "/ambiente/eclipse/workspace-erp/comercial/comercial/pom.xml"
mvn install -f "/ambiente/eclipse/workspace-erp/comercial/comercial/pom.xml"
sleep 10s
#erp
mvn clean -f "/ambiente/eclipse/workspace-erp/erp/erp/pom.xml"
mvn package -f "/ambiente/eclipse/workspace-erp/erp/erp/pom.xml"
