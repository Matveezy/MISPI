git clone https://github.com/Matveezy/dop_po_mispi.git
cd dop_po_mispi
git show | head -n2 | tail -1
name=$(pwgen 13 1)
echo $name
rm 1600px-Котята.jpeg
git config --local user.name "$name"
git config --local user.email "$name@email.com"
git add .
git commit -m "comm"
git push --force -u origin
git show | head -n2 | tail -1
