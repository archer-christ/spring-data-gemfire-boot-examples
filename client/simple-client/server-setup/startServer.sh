#!/usr/bin/env bash
rm -r ../locator1 ../server1
gfsh -e "start locator --name=locator1" \
-e "start server --name=server1" \
-e "create region --name=TestRegion --type=REPLICATE" \
-e "deploy --jar=../../../common/target/common-1.0-SNAPSHOT.jar" \
#-e "put --key=1 --value=('firstName':'James','lastName':'Gosling','address':'Cary NC') --region=Customer --value-class=sdg.examples.common.Customer"
#-e "create region --name=Customer --type=REPLICATE --value-constraint='sdg.examples.common.Customer'" \