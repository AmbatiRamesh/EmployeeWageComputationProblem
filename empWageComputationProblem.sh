echo "Welcome to Calcutale Daily Employee Wage"

isPresent=1;
randomCheck=$((RANDOM%2));
if [ $isPresent -eq $randomCheck ]
then
echo "Employee is present"
empRatePerHr=20
empHrs=8;
salary=$(($empHrs*$empRatePerHr))
echo "salary="$salary
else
echo "Employee is absent"
echo "salary="0
fi
