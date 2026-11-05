$OutputEncoding = [System.Text.Encoding]::UTF8
[Console]::OutputEncoding = [System.Text.Encoding]::UTF8
$host.UI.RawUI.WindowTitle = 'BQ-GIT'
git --version
Write-Host '==== STAGE1 ===='
Start-Sleep -Seconds 25
git clone https://github.com/dentroekurov615-web/minecraft-quartz-23b-VadDen "$env:TEMP\bq-clone-demo"
Write-Host '==== STAGE2 ===='
Start-Sleep -Seconds 25
cd C:\Users\dentr\Documents\minecraft-quartz-23b-VadDen
git pull
Write-Host '==== STAGE3 ===='
Start-Sleep -Seconds 25
git add -A
git commit -m "Обновлены материалы проекта"
git push
Write-Host '==== STAGE4 ===='
Start-Sleep -Seconds 30
git log --oneline
Write-Host '==== DONE ===='
