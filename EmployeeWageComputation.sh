echo "Welcome to Employee Wage Computation Program"

isPresent=1;
randomCheck=$((RANDOM%2));
if [ $isPresent -eq $randomCheck ]
<<<<<<< HEAD
then
echo "Employee is present"
else
echo "Employee is absent"
=======
then 
echo "Employee is present"
empRatePerHr=20
empHrs=8;
salary=$(($empHrs*$empRatePerHr))
echo "salary"$salary
else
echo "Employee is absent"
echo "salary="0
>>>>>>> main
fi
